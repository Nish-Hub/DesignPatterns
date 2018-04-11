package com.coding.designpattern.simplepattern;

public abstract class Pizza {
int size=4;
String name="pizza";
Sauce sauce=null;
Crust crust=null;
public void bake() {
}
public abstract void prepare();
public void serve() {
}
}
