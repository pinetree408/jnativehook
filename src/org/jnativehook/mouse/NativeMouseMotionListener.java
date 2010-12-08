/* JNativeHook: Global keyboard and mouse hooking for Java.
 * Copyright (C) 2006-2010 Alexander Barker.  All Rights Received.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jnativehook.mouse;

//Imports
import java.util.EventListener;

import org.jnativehook.GlobalScreen;

/**
 * The listener interface for receiving native mouse motion events. 
 * (For clicks and other mouse events, use the <code>NativeMouseListener</code>.)
 * <p>
 * The class that is interested in processing a <code>NativeMouseMotionEvent</code> 
 * implements this interface, and the object created with that class is 
 * registered with the <code>GlobalScreen</code> using the 
 * {@link GlobalScreen#addNativeMouseMotionListener} method. When the 
 * NativeMouseMotion event occurs, that object's appropriate method is invoked.
 *
 * @author	Alexander Barker (<a href="mailto:alex@1stleg.com">alex@1stleg.com</a>)
 * @version	1.0
 * @since	1.0
 * 
 * @see NativeMouseEvent
 */
public interface NativeMouseMotionListener extends EventListener {
	
	/**
	 * Invoked when the mouse has been moved.
	 *
	 * @param e The native mouse event.
	 */
	public void mouseMoved(NativeMouseEvent e);
	
	
	/* (non-Javadoc)
	 * Currently Unimplemented
	 *
	 * @param e the native mouse event
	 */
	//public void mouseDragged(MouseEvent e);
}
