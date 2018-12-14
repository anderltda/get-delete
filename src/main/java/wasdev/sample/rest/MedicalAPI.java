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

import wasdev.sample.store.MedicalStore;
import wasdev.sample.store.MedicalStoreFactory;
import wasdev.sample.vo.Medical;

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
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String delete(String _id) {

		if (store == null) {
			return String.format("No found store", "");
		}

		Medical medical = store.get(_id);
		
		store.delete(_id);
		
		return String.format("O Médico %s foi excluido com sucesso.", medical.getName());
	}
}