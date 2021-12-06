package com.persistence;

import java.util.ArrayList;

import com.bean.Element;

public interface ElementDao {
	ArrayList<Element> getAllElements();
	Element getElementByName(String ename);
	int addElement(Element element);
	int deleteElement(String ename);
	int updateElement(String ename,String w);
}
