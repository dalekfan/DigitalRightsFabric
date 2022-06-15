package net.fabricmc.digitalrightsf.mixin;

import net.fabricmc.digitalrightsf.DigitalRightsF;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;

@Mixin(TitleScreen.class)
public class DigitalRightsFMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		DigitalRightsF.LOGGER.info("This line is printed by an Digital Rights Fabric mixin!");
	}
}







	/*public boolean canTarget(EntityType<?> type) {
		if (this.isPlayerCreated() && type == EntityType.PLAYER) {
			return false;
		} else {
			return type == EntityType.CREEPER ? false : super.canTarget(type);
		}
	}*/