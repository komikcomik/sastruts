package org.seasar.sastruts.example.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


import org.seasar.sastruts.example.dto.PersonListDto;
import org.seasar.sastruts.example.form.PersonForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
public class PersonAction {

	@Resource
	@ActionForm
	protected PersonForm personForm;

	@Resource
	protected HttpSession session;

	@Execute(validator=false)
	/** 登録画面表示処理 */
	public String index() {
		return "input.jsp";
	}



	@Execute(validator=true, input="input.jsp")
	/** 登録処理 */
	public String regist() {
		PersonListDto pld = new PersonListDto();
		pld.personForm = personForm;
		session.setAttribute("personListDto", pld);
		return "complete?redirect=true";
	}

	/** リストに登録処理 */
	@Execute(validator=true, input="input.jsp")
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public String registList() {
		System.out.println("registList呼ばれました");
		List plist = (List<PersonForm>) session.getAttribute("plist");
		if( plist == null) {
			plist = new ArrayList<PersonForm>();
		}

		plist.add(personForm);
		session.setAttribute("plist", plist);
		return "completeList?redirect=true";
	}

	/** 登録完了画面に遷移する */
	@Execute(validator=false)
	public String complete() {
		return "complete.jsp";
	}

	/** リスト登録完了画面に遷移する */
	@Execute(validator=false)
	public String completeList() {
		return "completeList.jsp";
	}


}
