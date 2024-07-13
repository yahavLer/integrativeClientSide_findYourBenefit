package com.example.a2024b_integrative_client.model.miniappCommand;

public class CommandId {

	private String superapp;
	private String miniapp; 
	private String internalCommandId;
	
	public CommandId() {}

	public CommandId(String superapp, String miniapp, String internalCommandId) {
		this.superapp = superapp;
		this.miniapp = miniapp;
		this.internalCommandId = internalCommandId;
	}

	public String getSuperapp() {
		return superapp;
	}

	public void setSuperapp(String superapp) {
		this.superapp = superapp;
	}

	public String getMiniapp() {
		return miniapp;
	}

	public void setMiniapp(String miniapp) {
		this.miniapp = miniapp;
	}

	public String getInternalCommandId() {
		return internalCommandId;
	}

	public void setInternalCommandId(String internalCommandId) {
		this.internalCommandId = internalCommandId;
	}

	@Override
	public String toString() {
		return "MiniAppCommandID [superapp=" + superapp + ", miniapp=" + miniapp + ", internalCommandId="
				+ internalCommandId + "]";
	}
	
}