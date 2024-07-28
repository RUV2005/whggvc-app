package com.danmo.whggvc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danmo.whggvc.ui.theme.WhggvcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WhggvcTheme {
                /**
                 * 在Surface组件中布局各个课程的视图。
                 * Surface组件提供了统一的背景和边框处理，使得内部的布局和元素具有一致的外观。
                 * Column组件则用于垂直排列内部的各个元素，保证了界面的垂直方向上的布局结构。
                 */
                Surface {
                    Column {
                        // 展示顶部内容
                        Top()
                        // 添加间隔，用于分隔顶部内容和下一个元素
                        Spacer(modifier = Modifier.height(16.dp))
                        // 展示课程1的视图，左右填充16dp的间距，用于提供内容区域的边距
                        Class1(modifier = Modifier.padding(horizontal = 16.dp))
                        // 添加间隔，用于分隔课程1和下一个元素
                        Spacer(modifier = Modifier.height(16.dp))
                        // 展示课程2的视图，左右填充16dp的间距
                        Class2(modifier = Modifier.padding(horizontal = 16.dp))
                        // 添加间隔，用于分隔课程2和下一个元素
                        Spacer(modifier = Modifier.height(16.dp))
                        // 展示课程3的视图，左右填充16dp的间距
                        Class3(modifier = Modifier.padding(horizontal = 16.dp))
                        // 添加间隔，用于分隔课程3和下一个元素
                        Spacer(modifier = Modifier.height(16.dp))
                        // 展示课程4的视图，左右填充16dp的间距
                        Class4(modifier = Modifier.padding(horizontal = 16.dp))
                        // 添加间隔，用于分隔课程4和下一个元素
                        Spacer(modifier = Modifier.height(16.dp))
                        // 展示课程5的视图，左右填充16dp的间距
                        Class5(modifier = Modifier.padding(horizontal = 16.dp))
                        // 添加间隔，用于分隔课程5和下一个元素
                        Spacer(modifier = Modifier.height(16.dp))
                        // 展示课程6的视图，左右填充16dp的间距
                        Class6(modifier = Modifier.padding(horizontal = 16.dp))
                    }
                }
            }
        }
    }


    @Composable
    fun Top(modifier: Modifier = Modifier) {
        // 定义文本样式，用于后续Text组件的样式设置
        // 定义文本样式，用于文本组件的样式设置
        val textStyle = TextStyle(
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
        )

        // 创建一个带圆角的蓝色背景盒子，用于展示“今日课程”文本
        Box(
            // 使用Box作为布局容器，并设置其背景色
            modifier = modifier
                .fillMaxWidth() // 确保Box宽度填满父容器
                .height(100.dp) // 设置Box的高度
                .background(
                    color = Color(0xFF25D2FF),
                    shape = RoundedCornerShape(5.dp)
                ), // 设置背景色为蓝色，并添加圆角
            contentAlignment = Alignment.Center,
        ) {
            // 在盒子中心显示文本“今日课程”
            Text(
                text = "今日课程",
                modifier = Modifier, // 使用默认的修饰符，这里可以按需为Text组件添加额外的修饰符
                color = textStyle.color, // 从textStyle中提取颜色属性
                style = textStyle, // 应用定义的textStyle样式
            )
        }
    }

    @Composable
    fun Class1(modifier: Modifier = Modifier) {
        // 定义文本样式，用于统一控制文本的颜色、对齐方式和字体大小
        val textStyle = TextStyle(
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        // 创建一个带有圆角背景的Box，用于展示欢迎文本
        Box(
            modifier = modifier
                .fillMaxWidth() // 使Box填充父组件的全部宽度
                .height(70.dp) // 设置Box的高度
                .background( // 设置Box的背景颜色和形状
                    Color(0xA8FF0000),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(16.dp), // 在Box内部添加padding，提供内容与边界的间距
            contentAlignment = Alignment.Center, // 设置内容在Box中的对齐方式
        ) {
            // 显示欢迎文本
            Text(
                text = "欢迎来到课程页面",
                color = textStyle.color, // 使用之前定义的文本颜色
                style = textStyle, // 使用之前定义的文本样式
            )
        }
    }


    @Composable
    fun Class2(modifier: Modifier = Modifier) {
        // 定义文本样式，用于统一控制文本的颜色、对齐方式和字体大小
        val textStyle = TextStyle(
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        // 创建一个带有背景色和圆角的Box组件，用于展示欢迎文本
        Box(
            modifier = modifier
                .fillMaxWidth() // 让Box占据父组件的全部宽度
                .height(70.dp) // 设置Box的高度
                .background( // 设置Box的背景颜色和形状
                    Color(0xA8F88000),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(16.dp), // 在Box内部添加padding，提供内容与边界的间距
            contentAlignment = Alignment.Center, // 设置内容在Box中的对齐方式为居中
        ) {
            // 显示欢迎文本
            Text(
                text = "欢迎来到课程页面",
                color = textStyle.color, // 使用之前定义的文本颜色
                style = textStyle, // 使用之前定义的文本样式
            )
        }
    }


    @Composable
    fun Class3(modifier: Modifier = Modifier) {
        // 定义文本样式，用于统一控制文本的颜色、对齐方式和字体大小
        val textStyle = TextStyle(
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        // 创建一个带有圆角背景的Box，用于展示欢迎文本
        Box(
            modifier = modifier
                .fillMaxWidth() // 使Box填充父组件的全部宽度
                .height(70.dp) // 设置Box的高度
                .background( // 设置Box的背景颜色和形状
                    Color(0xFFFFE500),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(16.dp), // 在Box内部添加padding，提供内容与边界的间距
            contentAlignment = Alignment.Center, // 设置内容在Box中的对齐方式为居中
        ) {
            // 显示欢迎文本
            Text(
                text = "欢迎来到课程页面",
                color = textStyle.color, // 使用之前定义的文本颜色
                style = textStyle, // 使用之前定义的文本样式
            )
        }
    }

    @Composable
    fun Class4(modifier: Modifier = Modifier) {
        // 定义文本样式，用于统一设置文本的颜色、对齐方式和字体大小
        val textStyle = TextStyle(
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        // 创建一个带有圆角背景的Box，用于展示欢迎文本
        Box(
            modifier = modifier
                .fillMaxWidth() // 使Box填充父组件的全部宽度
                .height(70.dp) // 设置Box的高度
                .background( // 设置Box的背景颜色和形状
                    Color(0xFFB9FF00),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(16.dp), // 在Box内部添加padding，提供内容与边界的间距
            contentAlignment = Alignment.Center, // 设置内容在Box中的对齐方式为居中
        ) {
            // 显示欢迎文本
            Text(
                text = "欢迎来到课程页面",
                color = textStyle.color, // 使用之前定义的文本颜色
                style = textStyle, // 使用之前定义的文本样式
            )
        }
    }


    @Composable
    fun Class5(modifier: Modifier = Modifier) {
        // 定义文本样式，用于统一设置文本的颜色、对齐方式和字体大小
        val textStyle = TextStyle(
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        // 创建一个带有圆角背景的Box，用于展示欢迎文本
        Box(
            modifier = modifier
                .fillMaxWidth() // 使Box填充父组件的全部宽度
                .height(70.dp) // 设置Box的高度
                .background( // 设置Box的背景颜色和形状
                    Color(0xFF00FF09),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(16.dp), // 在Box内部添加padding，提供内容与边界的间距
            contentAlignment = Alignment.Center, // 设置内容在Box中的对齐方式为居中
        ) {
            // 显示欢迎文本
            Text(
                text = "欢迎来到课程页面",
                color = textStyle.color, // 使用之前定义的文本颜色
                style = textStyle, // 使用之前定义的文本样式
            )
        }
    }


    @Composable
    fun Class6(modifier: Modifier = Modifier) {
        // 定义文本样式，用于统一设置文本的颜色、对齐方式和字体大小
        val textStyle = TextStyle(
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        // 创建一个带有圆角背景的Box，用于展示欢迎文本
        Box(
            modifier = modifier
                .fillMaxWidth() // 使Box填充父组件的全部宽度
                .height(70.dp) // 设置Box的高度
                .background( // 设置Box的背景颜色和形状
                    Color(0xFF00FFB9),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(16.dp), // 在Box内部添加padding，提供内容与边界的间距
            contentAlignment = Alignment.Center, // 设置内容在Box中的对齐方式为居中
        ) {
            // 显示欢迎文本
            Text(
                text = "欢迎来到课程页面",
                color = textStyle.color, // 使用之前定义的文本颜色
                style = textStyle, // 使用之前定义的文本样式
            )

        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        // 使用WhggvcTheme定义应用的主题样式
        WhggvcTheme {
            // 创建一个垂直布局，用于展示各个组件的预览
            Column {
                // 显示顶部组件的预览
                Top()
                // 添加一个间隔，用于区分顶部组件和下一个组件
                Spacer(modifier = Modifier.height(10.dp))
                // 显示课程1的组件预览，并为其添加左右16dp的内边距
                Class1(modifier = Modifier.padding(horizontal = 16.dp))
                // 添加一个间隔，用于区分课程1和下一个组件
                Spacer(modifier = Modifier.height(30.dp))
                // 显示课程2的组件预览，并为其添加左右16dp的内边距
                Class2(modifier = Modifier.padding(horizontal = 16.dp))
                // 添加一个间隔，用于区分课程2和下一个组件
                Spacer(modifier = Modifier.height(30.dp))
                // 显示课程3的组件预览，并为其添加左右16dp的内边距
                Class3(modifier = Modifier.padding(horizontal = 16.dp))
                // 添加一个间隔，用于区分课程3和下一个组件
                Spacer(modifier = Modifier.height(30.dp))
                // 显示课程4的组件预览，并为其添加左右16dp的内边距
                Class4(modifier = Modifier.padding(horizontal = 16.dp))
                // 添加一个间隔，用于区分课程4和下一个组件
                Spacer(modifier = Modifier.height(30.dp))
                // 显示课程5的组件预览，并为其添加左右16dp的内边距
                Class5(modifier = Modifier.padding(horizontal = 16.dp))
                // 添加一个间隔，用于区分课程5和下一个组件
                Spacer(modifier = Modifier.height(30.dp))
                // 显示课程6的组件预览，并为其添加左右16dp的内边距
                Class6(modifier = Modifier.padding(horizontal = 16.dp))
                // 添加一个间隔，用于区分课程6和布局的底部
                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}
