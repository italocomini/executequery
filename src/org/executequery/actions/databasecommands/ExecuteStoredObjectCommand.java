/*
 * ExecuteStoredObjectCommand.java
 *
 * Copyright (C) 2002-2010 Takis Diakoumis
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.executequery.actions.databasecommands;

import java.awt.event.ActionEvent;

import org.executequery.GUIUtilities;
import org.underworldlabs.swing.actions.BaseCommand;
import org.executequery.actions.OpenFrameCommand;
import org.executequery.gui.ExecuteProcedurePanel;

/** 
 * Opens the execute stored objects panel.
 *
 *  @author   Takis Diakoumis
 * @version  $Revision$
 * @date     $Date$
 */
public class ExecuteStoredObjectCommand extends OpenFrameCommand
                                        implements BaseCommand {
    
    public void execute(ActionEvent e) {
        
        if (!isConnected()) {

            return;
        }

        try {
            GUIUtilities.showWaitCursor();

            GUIUtilities.addCentralPane(ExecuteProcedurePanel.TITLE,
                                        ExecuteProcedurePanel.FRAME_ICON, 
                                        new ExecuteProcedurePanel(),
                                        null,
                                        true);

        } finally {

            GUIUtilities.showNormalCursor();
        }

    }

}
