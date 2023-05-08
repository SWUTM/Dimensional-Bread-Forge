package net.swutm.dimensionalbread;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.swutm.dimensionalbread.init.DimensionalBreadModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(dimensionalbread.MOD_ID)
public class dimensionalbread
{
    public static final String MOD_ID = "dimensionalbread";
    private static final Logger LOGGER = LogUtils.getLogger();

    public dimensionalbread()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DimensionalBreadModItems.REGISTRY.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }
    }

