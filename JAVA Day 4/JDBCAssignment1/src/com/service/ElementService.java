package com.service;

import java.util.ArrayList;

import com.bean.Element;

public interface ElementService {
	ArrayList<Element> searchAllElement();
	Element searchElementByName(String ename);
	boolean insertElement(Element element);
	boolean removeElement(String ename);
	boolean updateElementByName(String ename,String w);

}
