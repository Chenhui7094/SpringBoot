package com.birdsh.chen.utils;

/**
 * @ClassName: ExcelHeader.java 
 * @Description:表头信息用于自动生成表头结构及排序
 * @author chenhuihui
 * @time 2017年10月17日下午2:24:01
 */
public class ExcelHeader implements Comparable<ExcelHeader>{
    /**
     * excel的标题名称
     */
    private String title;
    /**
     * 每一个标题的顺序
     */
    private int order;
    /**
     * 说对应方法名称
     */
    private String methodName;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getOrder() {
        return order;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public String getMethodName() {
        return methodName;
    }
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public int compareTo(ExcelHeader o) {
        return order>o.order?1:(order<o.order?-1:0);
    }
    public ExcelHeader(String title, int order, String methodName) {
        super();
        this.title = title;
        this.order = order;
        this.methodName = methodName;
    }
    @Override
    public String toString() {
        return "ExcelHeader [title=" + title + ", order=" + order
                + ", methodName=" + methodName + "]";
    }
}