package net.fabricmc.digitalrightsf.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;

@Mixin(ActiveTargetGoal.class)
public class ActiveTargetGoalMixin
extends TrackTargetGoalMixin
{
    @Inject(method = "findClosestTarget", at  = @At("TAIL"), cancellable = true)
    private void checkTeamsMixin(CallbackInfo cir) {
        if (targetEntity != null && mob.world.getScoreboard().getTeam(mob.getUuidAsString()).equals(targetEntity.world.getScoreboard().getTeam(targetEntity.getUuidAsString()))) {
            targetEntity = null;
        }
    }
    @Nullable
    protected LivingEntity targetEntity;
}
