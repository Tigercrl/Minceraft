package io.github.tigercrl.minceraft.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.LogoRenderer;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LogoRenderer.class)
public class LogoRendererMixin {
    @Shadow @Final public static ResourceLocation EASTER_EGG_LOGO;

    @Shadow @Final public static ResourceLocation MINECRAFT_EDITION;

    @Shadow @Final private boolean keepLogoThroughFade;

    /**
     * @author Tigercrl
     * @reason Always show "MINCERAFT" title.
     */
    @Overwrite()
    public void renderLogo(GuiGraphics guiGraphics, int i, float f, int j) {
        guiGraphics.setColor(1.0F, 1.0F, 1.0F, this.keepLogoThroughFade ? 1.0F : f);
        int k = i / 2 - 128;
        guiGraphics.blit(EASTER_EGG_LOGO, k, j, 0.0F, 0.0F, 256, 44, 256, 64);
        int l = i / 2 - 64;
        int m = j + 44 - 7;
        guiGraphics.blit(MINECRAFT_EDITION, l, m, 0.0F, 0.0F, 128, 14, 128, 16);
        guiGraphics.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }
}
