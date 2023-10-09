package ani.saikou.parsers.anime

import ani.saikou.Lazier
import ani.saikou.lazyList
import ani.saikou.parsers.BaseParser
import ani.saikou.parsers.WatchSources
import ani.saikou.parsers.anime.sources.AnimeDummy

object AnimeSources : WatchSources() {
    override val list: List<Lazier<BaseParser>> = lazyList(
//        "Dummy" to ::AnimeDummy,
        "Gogo" to ::Gogo,
        "AniWave" to ::AniWave,
        "AllAnime" to ::AllAnime,
        "AnimeDao" to ::AnimeDao,
        "AnimePahe" to ::AnimePahe,
        "Kaido" to ::Kaido,

    )
}

object HAnimeSources : WatchSources() {
    private val aList: List<Lazier<BaseParser>>  = lazyList(
        "Haho" to ::Haho,
    )

    override val list = listOf(aList, AnimeSources.list).flatten()
}
