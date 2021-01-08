package net.fabricmc.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net/minecraft/entity/mob/VindicatorEntity$FollowEntityGoal")
public class FollowEntityGoalMixin {
    @Inject(method = "canStart", at = @At("HEAD"))
    private void modifyCanStart(CallbackInfoReturnable<Boolean> cir) {
        if(true == true) {
            cir.setReturnValue(false);
        }else{
            cir.setReturnValue(true);
        }
    }
}
