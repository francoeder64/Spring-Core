package sv.edu.spring.xml.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class JavaCollectionXML {

	private List<?> addressList;
	private Set<?> addressSet;
	private Map<?, ?> addressMap;
	private Properties addressProp;

	public List<?> getAddressList() {
		System.out.println("getAddressList: " + this.addressList);
		return addressList;
	}

	public void setAddressList(List<?> addressList) {
		this.addressList = addressList;
	}

	public Set<?> getAddressSet() {
		System.out.println("getAddressSet: " + this.addressSet);
		return addressSet;
	}

	public void setAddressSet(Set<?> addressSet) {
		this.addressSet = addressSet;
	}

	public Map<?, ?> getAddressMap() {
		System.out.println("getAddressMap: " + this.addressMap);
		return addressMap;
	}

	public void setAddressMap(Map<?, ?> addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProp() {
		System.out.println("getAddressProp: " + this.addressProp);
		return addressProp;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

}
