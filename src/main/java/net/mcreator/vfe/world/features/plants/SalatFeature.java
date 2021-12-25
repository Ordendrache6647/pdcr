
package net.mcreator.vfe.world.features.plants;

import com.mojang.serialization.Codec;

public class SalatFeature extends RandomPatchFeature {
	public static final SalatFeature FEATURE = (SalatFeature) new SalatFeature().setRegistryName("vfe:salat");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(VfeModBlocks.SALAT.defaultBlockState()),
					SimpleBlockPlacer.INSTANCE).tries(64)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP_SPREAD_DOUBLE.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared()
			.rarity(32).count(5);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public SalatFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}
}
