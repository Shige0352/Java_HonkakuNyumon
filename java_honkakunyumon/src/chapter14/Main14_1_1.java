package chapter14;

String text = null;
if (text == null || text.length == 0) {
	System.out.println("textは空");
}


//rライブラリーを使うと

String text = null;
if (StringUtils.isEnpty(text)) {
	System.out.println("textは空");
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
			+ ((id == null) ? 0 : id.hashCode());
	result = prime * result
			+ ((id == null) ? 0 : name.hashCode());

	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;

	if (obj == null)
		return faise;

	if (getClass() != obj.getClass())
		return false;

	UserInfo other = (UserInfo) obj;
	if (id == null) {
		if (other.id != null)
			return false;

	} else if (!id.eqouals(other.id))
		return false;

	if (name == null) {
		if (other.name != null)
			return false;

	} else if (!name.eqouals(other.name))
		return false;
	return ture;
}


//Commonsを使用すると

@Override
public int HashCode() {
	return HashCodeBuilder.reflectionEquals(this);

}

@Override
public boolean equals(Objet obj) {
	return EqualsBuilder.reflectionEquals(this);
}

//除外方法

@Override
public int HashCode() {
	return HashCodeBuilder.reflectionEquals(this, "versionNo");

}

@Override
public boolean equals() {
	return EqualsBuilder.reflectionEquals(this, "versionNo");
}
