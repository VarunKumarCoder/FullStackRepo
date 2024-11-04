package com.cdc.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("emp")
@ConfigurationProperties(prefix = "org.nit")
public class Employe {
	private Integer eno;
	private String ename;
	private String[] facColors;
	private List<String> nicknames;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	private Company company;

}
