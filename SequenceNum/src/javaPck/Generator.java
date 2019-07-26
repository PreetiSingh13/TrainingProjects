package javaPck;

public class Generator {
private String prefix;
private String suffix;
private int num;
private int count;
public Generator(int count) {
	super();
	this.count = count;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public String getPrefix() {
	return prefix;
}
public void setPrefix(String prefix) {
	this.prefix = prefix;
}
public String getSuffix() {
	return suffix;
}
public void setSuffix(String suffix) {
	this.suffix = suffix;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public Generator(String prefix, String suffix, int num,int count) {
	super();
	this.prefix = prefix;
	this.suffix = suffix;
	this.num = num;
	this.count=count;
}
public Generator() {
	super();
}

}
