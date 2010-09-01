package com.test;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSetting", propOrder = {
        "setting"
})
@XmlRootElement(name = "ArrayOfSetting")
public class ArrayOfSetting extends WSClassStub {

    @XmlElement(name = "Setting")
    protected List<Setting> setting;


    public List<Setting> getSetting() {
        if (setting == null) {
            setting = new ArrayList<Setting>();
        }
        return this.setting;
    }

    @Override
    public String toString() {
        return "ArrayOfSetting [setting=" + setting + "]";
    }

}
