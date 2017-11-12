package org.seasar.sastruts.example.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.sastruts.example.form.PersonForm;

@Component(instance = InstanceType.SESSION)
public class PersonListDto implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public PersonForm personForm;

	public PersonForm getPersonForm() {
		return personForm;
	}

	public void setPersonForm(PersonForm personForm) {
		this.personForm = personForm;
	}


}
