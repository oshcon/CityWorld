package me.daddychurchill.CityWorld.Support;

import org.bukkit.Material;

public class CornerBlocks {

	private final static byte non = 0;
	private final static byte opt = 1;
	private final static byte FLR = 2;
	private final static byte WWW = 3;
	private final static byte GGG = 4;
	private final static byte WGG = 5;
	private final static byte WGW = 6;
	
	public static int CornerWidth = 7;
	
	public enum CornerBlocksStyle { ROUND, DIAGONAL, INNOTCH, OUTNOTCH, DOUBLENOTCH, OUTBUBBLE, INBUBBLE, COLUMN, BRACE, FINS}; 
	public enum CornerDirections { NW, NE, SW, SE };
	
	private final byte[][] DiagonalNW = {
			{FLR, FLR, FLR, FLR, FLR, opt, WWW},
			{FLR, FLR, FLR, FLR, opt, WGG, non},
			{FLR, FLR, FLR, opt, WGG, non, non},
			{FLR, FLR, opt, WWW, non, non, non},
			{FLR, opt, WGG, non, non, non, non},
			{opt, WGG, non, non, non, non, non},
			{WWW, non, non, non, non, non, non},
	};
	private byte[][] DiagonalNE;
	private byte[][] DiagonalSW;
	private byte[][] DiagonalSE;
	
	private final byte[][] InNotchNW = {
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, FLR, FLR, FLR, FLR, WGG},
			{FLR, FLR, FLR, FLR, FLR, FLR, WGG},
			{FLR, FLR, FLR, WWW, WGG, WGG, WWW},
			{FLR, FLR, FLR, WGG, non, non, non},
			{FLR, FLR, FLR, WGG, non, non, non},
			{WWW, WGG, WGG, WWW, non, non, non},
	};
	private byte[][] InNotchNE;
	private byte[][] InNotchSW;
	private byte[][] InNotchSE;
	
	private final byte[][] OutNotchNW = {
			{FLR, FLR, FLR, FLR, FLR, opt, WWW},
			{FLR, FLR, FLR, FLR, opt, WGG, non},
			{FLR, FLR, FLR, opt, WWW, non, non},
			{FLR, FLR, opt, opt, opt, WGW, non},
			{FLR, opt, WWW, opt, opt, opt, WGW},
			{opt, WGG, non, WGW, opt, WGW, non},
			{WWW, non, non, non, WGW, non, non},
	};
	private byte[][] OutNotchNE;
	private byte[][] OutNotchSW;
	private byte[][] OutNotchSE;
	
	private final byte[][] DoubleNotchNW = {
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, FLR, FLR, FLR, FLR, GGG},
			{FLR, FLR, FLR, FLR, WWW, GGG, GGG},
			{FLR, FLR, FLR, FLR, GGG, non, non},
			{FLR, FLR, WWW, GGG, GGG, non, non},
			{FLR, FLR, GGG, non, non, non, non},
			{WWW, GGG, GGG, non, non, non, non},
	};
	private byte[][] DoubleNotchNE;
	private byte[][] DoubleNotchSW;
	private byte[][] DoubleNotchSE;
	
	private final byte[][] OutBubbleNW = {
			{FLR, FLR, FLR, FLR, FLR, WGG, non},
			{FLR, FLR, FLR, FLR, FLR, WGG, non},
			{FLR, FLR, FLR, FLR, opt, WWW, non},
			{FLR, FLR, FLR, opt, WGG, non, non},
			{FLR, FLR, opt, WGG, non, non, non},
			{WGG, WGG, WWW, non, non, non, non},
			{non, non, non, non, non, non, non},
	};
	private byte[][] OutBubbleNE;
	private byte[][] OutBubbleSW;
	private byte[][] OutBubbleSE;
	
	private final byte[][] InBubbleNW = {
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, FLR, FLR, WGG, WGG, WGW},
			{FLR, FLR, FLR, WGG, non, non, non},
			{FLR, FLR, WGG, non, non, non, non},
			{FLR, FLR, WGG, non, non, non, non},
			{WWW, WWW, WGW, non, non, non, non},
	};
	private byte[][] InBubbleNE;
	private byte[][] InBubbleSW;
	private byte[][] InBubbleSE;
	
	private final byte[][] ColumnNW = {
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, WGG, WGG, WGG, WGG, WGG},
			{FLR, FLR, WGG, non, non, non, non},
			{FLR, FLR, WGG, non, WWW, WWW, WWW},
			{FLR, FLR, WGG, non, WWW, WWW, WWW},
			{WWW, WWW, WGG, non, WWW, WWW, WWW},
	};
	private byte[][] ColumnNE;
	private byte[][] ColumnSW;
	private byte[][] ColumnSE;
	
	private final byte[][] BraceNW = {
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, FLR, FLR, opt, GGG, WWW},
			{FLR, FLR, FLR, FLR, GGG, non, non},
			{FLR, FLR, FLR, WWW, WWW, non, non},
			{FLR, opt, GGG, WWW, WWW, WWW, non},
			{FLR, GGG, non, non, WWW, WWW, WWW},
			{WWW, WWW, non, non, non, WWW, WWW},
	};
	private byte[][] BraceNE;
	private byte[][] BraceSW;
	private byte[][] BraceSE;
	
	private final byte[][] FinsNW = {
			{FLR, FLR, FLR, FLR, FLR, FLR, WWW},
			{FLR, FLR, FLR, FLR, FLR, FLR, GGG},
			{FLR, FLR, FLR, FLR, WWW, GGG, GGG},
			{FLR, FLR, FLR, FLR, GGG, non, non},
			{FLR, FLR, WWW, GGG, GGG, non, non},
			{FLR, FLR, GGG, non, non, GGG, non},
			{WWW, GGG, GGG, non, non, non, GGG},
	};
	private byte[][] FinsNE;
	private byte[][] FinsSW;
	private byte[][] FinsSE;
	
	public CornerBlocksStyle pickCornerStyle(Odds odds) {
		return CornerBlocksStyle.OUTNOTCH;
//		CornerLotStyle[] values = CornerLotStyle.values();
//		return values[chunkOdds.getRandomInt(values.length)];
	}
	
	public CornerBlocks() {
		
		// DiagonalSW already done
		DiagonalNE = flipWE(DiagonalNW);
		DiagonalSE = flipNS(DiagonalNE);
		DiagonalSW = flipNS(DiagonalNW);
		
		// InNotchSW already done
		InNotchNE = flipWE(InNotchNW);
		InNotchSE = flipNS(InNotchNE);
		InNotchSW = flipNS(InNotchNW);
		
		// OutNotchSW already done
		OutNotchNE = flipWE(OutNotchNW);
		OutNotchSE = flipNS(OutNotchNE);
		OutNotchSW = flipNS(OutNotchNW);
		
		// DoubleNotchSW already done
		DoubleNotchNE = flipWE(DoubleNotchNW);
		DoubleNotchSE = flipNS(DoubleNotchNE);
		DoubleNotchSW = flipNS(DoubleNotchNW);
		
		// OutBubbleSW already done
		OutBubbleNE = flipWE(OutBubbleNW);
		OutBubbleSE = flipNS(OutBubbleNE);
		OutBubbleSW = flipNS(OutBubbleNW);
		
		// InBubbleSW already done
		InBubbleNE = flipWE(InBubbleNW);
		InBubbleSE = flipNS(InBubbleNE);
		InBubbleSW = flipNS(InBubbleNW);
		
		// ColumnSW already done
		ColumnNE = flipWE(ColumnNW);
		ColumnSE = flipNS(ColumnNE);
		ColumnSW = flipNS(ColumnNW);
		
		// BraceSW already done
		BraceNE = flipWE(BraceNW);
		BraceSE = flipNS(BraceNE);
		BraceSW = flipNS(BraceNW);
		
		// FinsSW already done
		FinsNE = flipWE(FinsNW);
		FinsSE = flipNS(FinsNE);
		FinsSW = flipNS(FinsNW);
		
	}
	
	public void drawVerticals(CornerDirections direction, CornerBlocksStyle style, AbstractBlocks blocks, int inset, int y1, int y2, 
			Material primary, Material secondary, boolean backfill) {
		byte[][] data = getStyleData(direction, style);
		if (data != null)
			setVerticals(data, blocks, inset, y1, y2, primary, secondary, backfill);
	}
	
	public void drawHorizontals(CornerDirections direction, CornerBlocksStyle style, AbstractBlocks blocks, int inset, int y1, int y2, 
			Material primary, Material secondary) {
		byte[][] data = getStyleData(direction, style);
		if (data != null)
			setHorizontals(data, blocks, inset, y1, y2, primary, secondary);
	}
	
	private byte[][] getStyleData(CornerDirections direction, CornerBlocksStyle style) {
		switch (style) {
		default:
		case ROUND:
			// legacy style, handled a different way
			return null;
		case DIAGONAL:
			switch (direction) {
			default:
			case NE:
				return DiagonalNE;
			case NW:
				return DiagonalNW;
			case SE:
				return DiagonalSE;
			case SW:
				return DiagonalSW;
			}
		case INNOTCH:
			switch (direction) {
			default:
			case NE:
				return InNotchNE;
			case NW:
				return InNotchNW;
			case SE:
				return InNotchSE;
			case SW:
				return InNotchSW;
			}
		case OUTNOTCH:
			switch (direction) {
			default:
			case NE:
				return OutNotchNE;
			case NW:
				return OutNotchNW;
			case SE:
				return OutNotchSE;
			case SW:
				return OutNotchSW;
			}
		case DOUBLENOTCH:
			switch (direction) {
			default:
			case NE:
				return DoubleNotchNE;
			case NW:
				return DoubleNotchNW;
			case SE:
				return DoubleNotchSE;
			case SW:
				return DoubleNotchSW;
			}
		case INBUBBLE:
			switch (direction) {
			default:
			case NE:
				return InBubbleNE;
			case NW:
				return InBubbleNW;
			case SE:
				return InBubbleSE;
			case SW:
				return InBubbleSW;
			}
		case OUTBUBBLE:
			switch (direction) {
			default:
			case NE:
				return OutBubbleNE;
			case NW:
				return OutBubbleNW;
			case SE:
				return OutBubbleSE;
			case SW:
				return OutBubbleSW;
			}
		case COLUMN:
			switch (direction) {
			default:
			case NE:
				return ColumnNE;
			case NW:
				return ColumnNW;
			case SE:
				return ColumnSE;
			case SW:
				return ColumnSW;
			}
		case BRACE:
			switch (direction) {
			default:
			case NE:
				return BraceNE;
			case NW:
				return BraceNW;
			case SE:
				return BraceSE;
			case SW:
				return BraceSW;
			}
		case FINS:
			switch (direction) {
			default:
			case NE:
				return FinsNE;
			case NW:
				return FinsNW;
			case SE:
				return FinsSE;
			case SW:
				return FinsSW;
			}
		}
	}
	
	private void setVerticals(byte[][] source, AbstractBlocks blocks, int inset, int y1, int y2, Material primary, Material secondary, boolean backfill) {
		for (int x = 0; x < CornerWidth; x++) {
			for (int z = 0; z < CornerWidth; z++) {
				switch (source[x][z]) {
				case non:
					break;
				case opt:
					if (backfill)
						blocks.setBlocks(inset + x, y1, y2, inset + z, primary);
					break;
				case WWW:
					blocks.setBlocks(inset + x, y1, y2, inset + z, primary);
					break;
				case GGG:
					blocks.setBlocks(inset + x, y1, y2, inset + z, secondary);
					break;
				case WGG:
					blocks.setBlock(inset + x, y1, inset + z, primary);
					blocks.setBlocks(inset + x, y1 + 1, y2, inset + z, secondary);
					break;
				case WGW:
					blocks.setBlock(inset + x, y1, inset + z, primary);
					blocks.setBlocks(inset + x, y1 + 1, y2 - 1, inset + z, secondary);
					blocks.setBlock(inset + x, y2 - 1, inset + z, primary);
					break;
				}
			}
		}
	}
	
	private void setHorizontals(byte[][] source, AbstractBlocks blocks, int inset, int y1, int y2, Material primary, Material secondary) {
		for (int x = 0; x < CornerWidth; x++) {
			for (int z = 0; z < CornerWidth; z++) {
				switch (source[x][z]) {
				case non:
					blocks.setBlocks(inset + x, y1, y2, inset + z, secondary);
					break;
				default:
					blocks.setBlocks(inset + x, y1, y2, inset + z, primary);
					break;
				}
			}
		}
	}
	
	private byte[][] flipWE(byte[][] source) {
		byte[][] result = new byte[CornerWidth][CornerWidth];
		for (int x = 0; x < CornerWidth; x++) {
			for (int z = 0; z < CornerWidth; z++) {
				result[CornerWidth - x - 1][z] = source[x][z];
			}
		}
		return result;
	}

	private byte[][] flipNS(byte[][] source) {
		byte[][] result = new byte[CornerWidth][CornerWidth];
		for (int x = 0; x < CornerWidth; x++) {
			for (int z = 0; z < CornerWidth; z++) {
				result[x][CornerWidth - z - 1] = source[x][z];
			}
		}
		return result;
	}
}