package com.ywkj.nest.activemq;


import java.io.Serializable;

class EventDataDto implements Serializable {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public EventDataDto(Object data) {
        this.data = data;

    }
}
