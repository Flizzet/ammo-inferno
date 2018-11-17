package com.flizzet.heads;

import com.badlogic.gdx.graphics.Texture;
import com.flizzet.headsystem.Head;
import com.flizzet.main.GameManager;

/**
 * Concrete knight head.
 *
 * @author Pedro Dutra (2017)
 * @version 1.0
 */
public class KnightHead extends Head {

    /** Default instantiable constructor */
    public KnightHead() {
	super(GameManager.getInstance().assetManager.get("player/head/knight.png", Texture.class),
		"knight");
	this.iconImage = GameManager.getInstance().assetManager.get("gui/headShop/icons/knight.png");
    }

}
