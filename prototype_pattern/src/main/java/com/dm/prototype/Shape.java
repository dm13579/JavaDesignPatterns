package com.dm.prototype;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Shape
 * @Description:TODO
 * @date 2019/12/3
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;
    public abstract void draw();
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
