package com.newjumper.taloi.datagen.sounds;

import com.newjumper.taloi.ThatsALotOfItems;
import com.newjumper.taloi.sound.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class ModSoundsProvider extends SoundDefinitionsProvider {
    public ModSoundsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
        super(pGenerator, ThatsALotOfItems.MOD_ID, existingFileHelper);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.THE_CAVES.get(), definition().with(sound(new ResourceLocation(ThatsALotOfItems.MOD_ID, "the_caves"))));
    }
}
