package com.example.study_material

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
private fun ItemUI(message: Message) {
   Column(
       modifier = Modifier
           .padding(1.dp)
   )
   {

       Row(
           modifier = androidx.compose.ui.Modifier
               .fillMaxWidth()
               .padding(10.dp),
           verticalAlignment = Alignment.CenterVertically
       ) {
           Column(
              modifier = Modifier
                  .background(colorResource(id = R.color.windowBackgroundGray))
           ) {

               Image(
                   painter =
                   painterResource(id = message.ProfileImage),
                   contentDescription = null,
                   modifier = androidx.compose.ui.Modifier
                       .width(20.dp)
                       .height(20.dp)


               )
           }

           Column(
               modifier = androidx.compose.ui.Modifier
                   .padding(start = 16.dp)
                   .width(230.dp)

           ) {
               Text(
                   text = message.name
               )
           }
           Column(
               modifier = androidx.compose.ui.Modifier
                   .fillMaxWidth()
                   .padding(start = 50.dp),
               horizontalAlignment = Alignment.End
           ) {

               Image(
                   painter =
                   painterResource(id = message.sign),
                   contentDescription = null,
                   modifier = androidx.compose.ui.Modifier
                       .width(20.dp)
                       .height(20.dp)
                       .clip(CircleShape),
                   contentScale = ContentScale.Crop
               )
           }

       }
   }
    Row(modifier = Modifier
        .padding(start = 20.dp, top = 15.dp, bottom = 15.dp)) {
        Divider(color = Color.LightGray, thickness = 1.dp)
    }


    }


@Composable
fun MyRecyclerView(message: List<Message>) {
    LazyColumn {
        items(message) { myMessage ->
            ItemUI(message = myMessage)
        }
    }

}


    @Preview(showBackground = true)
    @Composable
    fun MyPrev() {
        val sms = remember {
            MyRepository().getAllMessages()
        }
        MyRecyclerView(message = sms)
    }


