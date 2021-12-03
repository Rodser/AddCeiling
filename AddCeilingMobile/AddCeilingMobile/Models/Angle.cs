using System;

namespace AddCeilingMobile
{
    internal class Angle
    {
        public double Radian { get; set; }
        public double Degrees { get; set; }

        public Angle(double angle)
        {
            Degrees = angle;
            Radian = Angle.GetRadian(Degrees);
        }

        public Angle(AngleStandart angleStandart)
        {
            Degrees = (int)angleStandart;
            Radian = GetRadian(Degrees);
        }

        internal void SetValueDegrees(Angle angle)
        {
            var newDegrees = (540 - Degrees + angle.Degrees) % 360;
            Degrees = newDegrees;
            Radian = Angle.GetRadian(newDegrees);
        }

        private static double GetRadian(double angle)
        {
            return angle * Math.PI / 180;
        }
    }
}
