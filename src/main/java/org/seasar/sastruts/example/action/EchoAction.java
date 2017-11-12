package org.seasar.sastruts.example.action;

import javax.annotation.Resource;

import org.seasar.sastruts.example.form.EchoForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
public class EchoAction {

	@Resource
	@ActionForm
	protected EchoForm echoForm;

	@Execute(validator=false)
	public String index() {
		return "input.jsp";
	}

	// チェックエラー時はinputで書いたパスに戻る
	@Execute(validator=true, input="input.jsp")
	public String echo() {
		return "echo.jsp";
	}

	// チェックエラー時はinputで書いたパスに戻る
	@Execute(validator=true, input="input.jsp")
	public String evening() {
		return "evening.jsp";
	}
}
