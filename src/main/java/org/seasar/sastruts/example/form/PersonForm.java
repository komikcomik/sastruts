package org.seasar.sastruts.example.form;

import java.io.Serializable;

import org.seasar.struts.annotation.Required;

public class PersonForm implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Required
	/** 名前 */
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBelonging() {
		return belonging;
	}

	public void setBelonging(String belonging) {
		this.belonging = belonging;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Required
	/** 所属*/
	public String belonging;

	@Required
	/** 特徴*/
	public String feature;


}
