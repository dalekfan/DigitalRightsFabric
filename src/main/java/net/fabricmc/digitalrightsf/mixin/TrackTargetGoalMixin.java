package net.fabricmc.digitalrightsf.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TrackTargetGoal;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;

@Mixin(TrackTargetGoal.class)
public class TrackTargetGoalMixin {
    @Final
    @Shadow
    protected MobEntity mob;
}