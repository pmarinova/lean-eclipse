package org.eclipse.e4.ui.workbench.renderers.swt;

import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;

public class CustomWorkbenchRendererFactory extends WorkbenchRendererFactory {

	private CustomStackRenderer stackRenderer;

	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		if (uiElement instanceof MPartStack) {
			if (stackRenderer == null) {
				stackRenderer = new CustomStackRenderer();
				super.initRenderer(stackRenderer);
			}
			return stackRenderer;
		}
		return super.getRenderer(uiElement, parent);
	}
}
