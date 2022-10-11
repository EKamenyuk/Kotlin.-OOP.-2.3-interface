data class Post(
    var id : Long = 0,
    val ownerId : Long,
    val fromId : Long,
    val createdBy : Long,
    val date : Long,
    val text : String,
    val replyOwnerId : Long,
    val replyPostId : Long,
    val friendsOnly : Boolean,
    val comments : Comments,
    val likes : Likes,
    val reposts : Reposts?,
    val views : Views?,
    val postType : String,
    val signerId : Long,
    val canPin : Boolean,
   val canDelete : Boolean,
    val canEdit : Boolean,
   val isPinned : Boolean,
    val markedAsAds : Boolean,
    val isFavorite : Boolean,
    val postponedId : Long,
    val attachments : Array<Attachment>? = emptyArray(),
    val copyHistory : Array<Post>? = emptyArray(),

)