using Xamarin.Forms;

namespace AddCeilingMobile
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            MainPage = new BuildPage();
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
