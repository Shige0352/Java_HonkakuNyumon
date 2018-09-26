package chapter14;

public UserInfo(UserInfo orig) {
	this.id = orig.id;
	this.name = orig.name;
	this.mail = orig.mail;
}


oublic UserInfo(UserInfo orig) {
	BeanUtils.copyPrpperties(this, orig):
}