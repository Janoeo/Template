package fr.alasdiablo.janoeo.template;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@MethodsReturnNonnullByDefault
@Mod(Registries.MOD_ID)
public class Template {

    private static final Logger LOGGER = LogManager.getLogger(Registries.MOD_ID);

    public Template() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::onRegistry);
        modBus.addListener(this::onSetup);
        modBus.addListener(this::onGatherData);
    }

    private void onRegistry(RegistryEvent.NewRegistry newRegistry) {}

    private void onSetup(FMLCommonSetupEvent commonSetupEvent) {}

    private void onGatherData(GatherDataEvent event) {}
}
