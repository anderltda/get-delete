/*******************************************************************************
 * Copyright (c) 2017 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package wasdev.sample.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import wasdev.sample.store.MedicalStore;
import wasdev.sample.store.MedicalStoreFactory;
import wasdev.sample.vo.Medical;
import wasdev.sample.vo.Response;

/**
 * @author anderson.nascimento
 *
 */
@ApplicationPath("api")
@Path("/medical")
public class MedicalAPI extends Application {

	//Our database store
	MedicalStore store = MedicalStoreFactory.getInstance();

	/**
	 * @param _id
	 * @return
	 */
	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String delete(Medical me) {

		if (store == null) {
			return String.format("No found store", "");
		}
		
		store.delete(me.get_id());
		
		return new Gson().toJson(new Response());
	}
}