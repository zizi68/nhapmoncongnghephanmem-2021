USE [master]
GO
/****** Object:  Database [QLTHUVIEN]    Script Date: 4/29/2021 4:41:04 PM ******/
CREATE DATABASE [QLTHUVIEN]

GO
ALTER DATABASE [QLTHUVIEN] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLTHUVIEN].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLTHUVIEN] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLTHUVIEN] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLTHUVIEN] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLTHUVIEN] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLTHUVIEN] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLTHUVIEN] SET  MULTI_USER 
GO
ALTER DATABASE [QLTHUVIEN] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLTHUVIEN] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLTHUVIEN] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLTHUVIEN] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLTHUVIEN] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLTHUVIEN] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'QLTHUVIEN', N'ON'
GO
ALTER DATABASE [QLTHUVIEN] SET QUERY_STORE = OFF
GO
USE [QLTHUVIEN]
GO
/****** Object:  Table [dbo].[DOCGIA]    Script Date: 4/29/2021 4:41:04 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DOCGIA](
	[MADOCGIA] [nvarchar](50) NOT NULL,
	[TENDOCGIA] [nvarchar](200) NOT NULL,
	[GIOITINH] [nchar](3) NULL,
	[NGAYSINH] [date] NULL,
	[LOP] [nchar](50) NULL,
	[NGAYLAMTHE] [date] NOT NULL,
	[NGAYHETHAN] [date] NOT NULL,
 CONSTRAINT [PK_DOCGIA] PRIMARY KEY CLUSTERED 
(
	[MADOCGIA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MUONSACH]    Script Date: 4/29/2021 4:41:04 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MUONSACH](
	[MAPHIEU] [nchar](10) NOT NULL,
	[MADOCGIA] [nvarchar](50) NOT NULL,
	[MATAILIEU] [nchar](10) NOT NULL,
	[NGAYMUON] [date] NOT NULL,
	[SLMUON] [int] NOT NULL,
	[SLTRA] [int] NOT NULL,
 CONSTRAINT [PK_MUONSACH] PRIMARY KEY CLUSTERED 
(
	[MAPHIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TAILIEU]    Script Date: 4/29/2021 4:41:04 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TAILIEU](
	[MATAILIEU] [nchar](10) NOT NULL,
	[TENTAILIEU] [nchar](200) NOT NULL,
	[NGAYNHAP] [date] NULL,
	[GIA] [int] NULL,
	[VITRI] [nchar](10) NULL,
	[TACGIA] [nchar](100) NULL,
	[NXB] [nchar](10) NULL,
	[THELOAI] [nchar](100) NOT NULL,
	[SOLUONG] [int] NOT NULL,
 CONSTRAINT [PK_TAILIEU] PRIMARY KEY CLUSTERED 
(
	[MATAILIEU] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[USER]    Script Date: 4/29/2021 4:41:04 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[USER](
	[ID] [nvarchar](50) NOT NULL,
	[PASSWORD] [nvarchar](50) NOT NULL,
	[MADOCGIA] [nvarchar](50) NULL,
 CONSTRAINT [PK_USER] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[MUONSACH]  WITH CHECK ADD  CONSTRAINT [FK_MUONSACH_DOCGIA] FOREIGN KEY([MADOCGIA])
REFERENCES [dbo].[DOCGIA] ([MADOCGIA])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[MUONSACH] CHECK CONSTRAINT [FK_MUONSACH_DOCGIA]
GO
ALTER TABLE [dbo].[MUONSACH]  WITH CHECK ADD  CONSTRAINT [FK_MUONSACH_TAILIEU] FOREIGN KEY([MATAILIEU])
REFERENCES [dbo].[TAILIEU] ([MATAILIEU])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[MUONSACH] CHECK CONSTRAINT [FK_MUONSACH_TAILIEU]
GO
ALTER TABLE [dbo].[USER]  WITH CHECK ADD FOREIGN KEY([MADOCGIA])
REFERENCES [dbo].[DOCGIA] ([MADOCGIA])
GO
USE [master]
GO
ALTER DATABASE [QLTHUVIEN] SET  READ_WRITE 
GO
