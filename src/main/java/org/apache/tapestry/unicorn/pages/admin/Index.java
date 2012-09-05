/* Copyright 2011 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tapestry.unicorn.pages.admin;

import org.apache.tapestry.unicorn.services.DatabaseAdminService;
import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.ioc.annotations.Inject;

public class Index
{

	@Inject
	AlertManager alertManager;
	
	@Inject
	DatabaseAdminService databaseAdminService;

	Object onActionFromBackupLink()
	{
		databaseAdminService.performBackup();
		alertManager.info("Backup completed");
		return null;
	}
}
