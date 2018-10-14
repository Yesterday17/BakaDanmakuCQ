package cn.yesterday17.bakadanmakucq;

import cn.yesterday17.bakadanmakucq.thread.HatsuneMessageThread;
import github.tartaricacid.bakadanmaku.api.thread.DanmakuThreadFactory;
import github.tartaricacid.bakadanmaku.config.BakaDanmakuConfig;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BakaDanmakuCQ.MODID, name = BakaDanmakuCQ.NAME, version = BakaDanmakuCQ.VERSION)
public class BakaDanmakuCQ
{
    public static final String MODID = "baka_danmaku_cq";
    public static final String NAME = "BakaDanmaku CQ";
    public static final String VERSION = "0.0.1-SNAPSHOT";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        DanmakuThreadFactory.setDanmakuThread("hatsunelike-coolq", new HatsuneMessageThread());
    }
}
