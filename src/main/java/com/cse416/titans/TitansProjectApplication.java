package com.cse416.titans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TitansProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(TitansProjectApplication.class, args);
	}


	// @Bean
	// CommandLineRunner runner(DistrictPlanRepo districtPlanRepo) {
	// 	return args -> {

	// 		JSONParser parser1 = new JSONParser();
	// 		JSONParser parser2 = new JSONParser();
	// 		JSONParser parser3 = new JSONParser();

	// 		Reader reader1 = new FileReader("C:\\Users\\ufg11\\Desktop\\AZ.json");
	// 		Reader reader2 = new FileReader("C:\\Users\\ufg11\\Desktop\\NV.json");
	// 		Reader reader3 = new FileReader("C:\\Users\\ufg11\\Desktop\\LA.json");
	// 		JSONObject az_json = (JSONObject)parser1.parse(reader1);
	// 		JSONObject nv_json = (JSONObject)parser2.parse(reader2);
	// 		JSONObject la_json = (JSONObject)parser3.parse(reader3);

	// 		DistrictPlan az = new DistrictPlan();
	// 		DistrictPlan nv = new DistrictPlan();
	// 		DistrictPlan la = new DistrictPlan();
	// 		az.setId("curr_AZ");
	// 		nv.setId("curr_NV");
	// 		la.setId("curr_LA");
	// 		az.setGeoJson(az_json);
	// 		nv.setGeoJson(nv_json);
	// 		la.setGeoJson(la_json);
	// 		districtPlanRepo.save(az);
	// 		districtPlanRepo.save(nv);
	// 		districtPlanRepo.save(la);
	// 	};
	// }
}
