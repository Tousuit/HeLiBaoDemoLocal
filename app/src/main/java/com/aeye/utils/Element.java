package com.aeye.utils;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  
/** 
 * XML元素类 
 
 */  
public class Element {  
    private String name;                 //元素名  
    private String nodeText = "";        //文本值  
    private Map<String,String> property = new HashMap<String,String>(); //属性  
    private boolean isleaf = true;       //是否子节点  
    private List<Element> child = new ArrayList<Element>();         //子节点  
      
    public Element(String name) {  
        this.name = name;  
    }  
      
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getNodeText() {  
        return nodeText;  
    }  
    public void setNodeText(String nodeText) {  
        this.nodeText = nodeText;  
    }  
    public Map<String, String> getProperty() {  
        return property;  
    }  
    public void setProperty(Map<String, String> property) {  
        this.property = property;  
    }  
    public boolean isIsleaf() {  
        return isleaf;  
    }  
    //这个方法应该屏蔽  
    public void setIsleaf(boolean isleaf) {  
        this.isleaf = isleaf;  
    }  
    public List<Element> getChild() {  
        return child;  
    }  
    public void setChild(List<Element> child) {  
        this.child = child;  
        if(this.isleaf && this.child.size() > 0){  
            this.isleaf = false;  
        }  
    }  
  
    /** 
     * 添加属性 
     * @param key 
     * @param value 
     */  
    public void addProperty(String key,String value){  
        this.property.put(key, value);  
    }  
      
    /** 
     * 添加子节点 
     * @param el 
     */  
    public void addChild(Element el){  
        this.child.add(el);  
        if(this.isleaf && this.child.size() > 0){  
            this.isleaf = false;  
        }  
    }  
}  
