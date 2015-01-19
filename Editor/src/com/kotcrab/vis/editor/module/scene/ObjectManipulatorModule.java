/*
 * Copyright 2014-2015 Pawel Pastuszak
 *
 * This file is part of VisEditor.
 *
 * VisEditor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VisEditor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VisEditor.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kotcrab.vis.editor.module.scene;

import com.badlogic.gdx.utils.Array;
import com.kotcrab.vis.editor.module.scene.ObjectSelectorModule.ObjectSelectorListener;
import com.kotcrab.vis.editor.ui.scene.ObjectProperties;

public class ObjectManipulatorModule extends SceneModule {
	private ObjectProperties objectProperties;
	private ObjectSelectorModule objectSelector;

	@Override
	public void added () {
		objectProperties = new ObjectProperties();
		objectSelector = sceneContainer.get(ObjectSelectorModule.class);
	}

	@Override
	public void init () {
		objectSelector.setListener(new ObjectSelectorListener() {
			@Override
			public void selected (Array<Object2d> selected) {

			}
		});
	}

	@Override
	public void dispose () {
	}

	public ObjectProperties getObjectProperties () {
		return objectProperties;
	}
}