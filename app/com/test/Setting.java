package com.test;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Setting", propOrder = {
        "settingId",
        "settingValue"
})
@XmlRootElement(name = "Setting")
public class Setting extends WSClassStub {

    @XmlElement(name = "SettingId")
    protected String settingId;
    @XmlElement(name = "SettingValue")
    protected String settingValue;

    public String getSettingId() {
        return settingId;
    }

    public void setSettingId(String value) {
        this.settingId = value;
    }

    public String getSettingValue() {
        return settingValue;
    }

    public void setSettingValue(String value) {
        this.settingValue = value;
    }


    @Override
    public String toString() {
        return "Setting [settingId=" + settingId + ", settingValue=" + settingValue + "]";
    }

}
