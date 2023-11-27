package com.Ryama.ShibaMod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockKissyo extends Block {
    public BlockKissyo() {
        super(Properties.of()
                .strength(1.0f, 1.0f)
                .noOcclusion());
    }

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING,
                context.getHorizontalDirection().getOpposite());
    }

    // ブロックの当たり判定を設定
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH:
                return Shapes.create(new AABB(0.0, 0.0, 0.9, 1.0, 1.0, 1.0));
            case SOUTH:
                return Shapes.create(new AABB(0.0, 0.0, 0.0, 1.0, 1.0, 0.1));
            case WEST:
                return Shapes.create(new AABB(0.9, 0.0, 0.0, 1.0, 1.0, 1.0));
            case EAST:
                return Shapes.create(new AABB(0.0, 0.0, 0.0, 0.1, 1.0, 1.0));
            default:
                return Shapes.block();
        }
    }
}
