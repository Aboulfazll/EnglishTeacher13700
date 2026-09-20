Spacer(Modifier.height(12.dp))

// ==================== ویدیوهای آموزشی ====================
Card(
    modifier = Modifier
        .fillMaxWidth()
        .height(80.dp)
        .clickable { onVideoClick() },
    shape = RoundedCornerShape(18.dp),
    elevation = CardDefaults.cardElevation(6.dp)
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.horizontalGradient(
                    listOf(Color(0xFF3949AB), Color(0xFF5C6BC0))
                )
            )
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.25f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Filled.PlayCircle,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
            Spacer(Modifier.width(14.dp))
            Column {
                Text(
                    "ویدیوهای آموزشی",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    "آموزش آفلاین با ویدیو",
                    fontSize = 11.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }
    }
}

Spacer(Modifier.height(12.dp))