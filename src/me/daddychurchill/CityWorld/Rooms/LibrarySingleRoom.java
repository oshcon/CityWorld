package me.daddychurchill.CityWorld.Rooms;

import org.bukkit.Material;

import me.daddychurchill.CityWorld.Support.Direction.Facing;
import me.daddychurchill.CityWorld.Support.Odds;
import me.daddychurchill.CityWorld.Support.RealChunk;

public class LibrarySingleRoom extends LibraryRoom {

	public LibrarySingleRoom() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw(RealChunk chunk, Odds odds, int x, int y, int z,
			int width, int height, int depth, Facing sideWithWall, byte wallId,
			byte glassId) {
		int offset;
		switch (sideWithWall) {
		case NORTH:
		case SOUTH:
			offset = odds.getRandomInt(width);
			chunk.setBlocks(x + offset, x + 1 + offset, y, y + height, z, z + depth, Material.BOOKSHELF);
			break;
		case WEST:
		case EAST:
			offset = odds.getRandomInt(depth);
			chunk.setBlocks(x, x + width, y, y + height, z + offset, z + 1 + offset, Material.BOOKSHELF);
			break;
		}
	}

}
