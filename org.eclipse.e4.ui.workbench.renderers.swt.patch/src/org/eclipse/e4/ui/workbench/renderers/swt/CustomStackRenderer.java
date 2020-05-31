package org.eclipse.e4.ui.workbench.renderers.swt;

import org.eclipse.e4.ui.internal.workbench.renderers.swt.SWTRenderersMessages;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class CustomStackRenderer extends StackRenderer
{
	protected void populateTabMenu(final Menu menu, MPart part) {
		super.populateTabMenu(menu, part);
		removeDetachMenuItem(menu);
		removeTrailingSeparator(menu);
	}
	
	private void removeDetachMenuItem(final Menu menu) {
		for (MenuItem menuItem : menu.getItems()) {
			if (SWTRenderersMessages.menuDetach.equals(menuItem.getText())) {
				menuItem.dispose();
			}
		}
	}
	
	private void removeTrailingSeparator(final Menu menu) {
	 	 MenuItem lastMenuItem = menu.getItem(menu.getItemCount()-1);
	 	 if (lastMenuItem.getStyle() == SWT.SEPARATOR) {
	 		 lastMenuItem.dispose();
	 	 }
	}
}
