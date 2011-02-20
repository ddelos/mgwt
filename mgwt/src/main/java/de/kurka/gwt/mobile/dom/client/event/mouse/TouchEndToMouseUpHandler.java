/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.kurka.gwt.mobile.dom.client.event.mouse;

import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;

import de.kurka.gwt.mobile.dom.client.event.touch.TouchEndHandler;

/**
 * @author Daniel Kurka
 *
 */
public class TouchEndToMouseUpHandler implements MouseUpHandler {
	private final TouchEndHandler handler;

	public TouchEndToMouseUpHandler(TouchEndHandler handler) {
		this.handler = handler;
	}

	@Override
	public void onMouseUp(MouseUpEvent event) {
		handler.onTouchEnd(new SimulatedTouchEndEvent(event));

	}
}
