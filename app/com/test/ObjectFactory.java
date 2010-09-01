package com.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessObjects.SettingsDataMgr", "ArrayOfSetting");
    private final static QName _Setting_QNAME = new QName("http://schemas.datacontract.org/2004/07/BusinessObjects.SettingsDataMgr", "Setting");

    public ArrayOfSetting createArrayOfSetting() {
        return new ArrayOfSetting();
    }


    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessObjects.SettingsDataMgr", name = "ArrayOfSetting")
    public JAXBElement<ArrayOfSetting> createArrayOfSetting(ArrayOfSetting value) {
        return new JAXBElement<ArrayOfSetting>(_ArrayOfSetting_QNAME, ArrayOfSetting.class, null, value);
    }

    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BusinessObjects.SettingsDataMgr", name = "Setting")
    public JAXBElement<Setting> createSetting(Setting value) {
        return new JAXBElement<Setting>(_Setting_QNAME, Setting.class, null, value);
    }

}
