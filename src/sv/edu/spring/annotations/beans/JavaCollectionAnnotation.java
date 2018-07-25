package sv.edu.spring.annotations.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class JavaCollectionAnnotation {

	@Autowired
	private List<?> addressList;
	@Autowired
	private Set<?> addressSet;
	@Autowired
	private Map<?, ?> addressMap;
	@Autowired
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
