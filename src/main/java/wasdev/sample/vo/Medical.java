/*
 * Copyright IBM Corp. 2017
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
 */
package wasdev.sample.vo;

import java.io.Serializable;

/**
 * Represents a Medical document stored in Cloudant.
 */

public class Medical implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private String _rev;
	private String rm;
	private String especialidade;
	private String name;

	public Medical() {
		this.name = "";
	}

	/**
	 * Gets the ID.
	 * 
	 * @return The ID.
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * Sets the ID
	 * 
	 * @param _id
	 *            The ID to set.
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	/**
	 * Gets the revision of the document.
	 * 
	 * @return The revision of the document.
	 */
	public String get_rev() {
		return _rev;
	}

	/**
	 * Sets the revision.
	 * 
	 * @param _rev
	 *            The revision to set.
	 */
	public void set_rev(String _rev) {
		this._rev = _rev;
	}
	
	/**
	 * Gets the medicalName of the document.
	 * 
	 * @return The name of the document.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name
	 * 
	 * @param name
	 *            The medicalName to set.
	 */
	public void setName(String medicalName) {
		this.name = medicalName;
	}

	/**
	 * @return the rm
	 */
	public String getRm() {
		return rm;
	}

	/**
	 * @param rm the rm to set
	 */
	public void setRm(String rm) {
		this.rm = rm;
	}

	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}	
}