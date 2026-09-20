@Composable
private fun LevelProgressCard(
    title: String,
    subtitle: String,
    done: Int,
    total: Int,
    color: Color
) {
    val progress = if (total > 0) done.toFloat() / total else 0f
    val percent = (progress * 100).toInt()

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A237E)
                    )
                    Text(subtitle, fontSize = 12.sp, color = Color.Gray)
                }
                Text(
                    "$percent%",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = color
                )
            }
            Spacer(Modifier.height(12.dp))
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
                color = color,
                trackColor = color.copy(alpha = 0.15f)
            )
            Spacer(Modifier.height(6.dp))
            Text(
                "$done از $total درس کامل شده",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}