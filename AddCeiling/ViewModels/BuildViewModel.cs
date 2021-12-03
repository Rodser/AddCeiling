using Microsoft.Maui.Controls;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using Microsoft.Maui.Graphics;
using System.Windows.Input;
using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Diagnostics;

namespace AddCeiling
{
    internal class BuildViewModel : INotifyPropertyChanged
    {
        private readonly Repository _repository;
        private Angle _selectedAngle;
        private Angle _selectedAngleDefault;
        private string _onSelectAngle;
        private bool _hasPickerActive;

        public event PropertyChangedEventHandler PropertyChanged;

        public PointCollection Points { get; set; }
        public List<string> Angles { get; set; }
        public string OnSelectAngle
        {
            get => _onSelectAngle; 
            set
            {
                if (value != _onSelectAngle)
                {
                    _onSelectAngle = value;
                    _selectedAngle = new Angle(double.Parse(value));
                    OnPropertyChanged(OnSelectAngle);
                }
            }
        }
        //public Angle SelectedAngle
        //{
        //    get => _selectedAngle; 
        //    set
        //    {
        //        if (value != _selectedAngle)
        //        {
        //            _selectedAngle = value;
        //            OnPropertyChanged(nameof(SelectedAngle));
        //        }
        //    }
        //}
        public double EntrySegment { get; set; }
        public ObservableCollection<Segment> Segments { get; set; }
        public ICommand AddSegment { get; set; }
        public ICommand OnClear { get; set; }
        public bool HasPickerActive { get => _hasPickerActive; set { _hasPickerActive = value; OnPropertyChanged(nameof(HasPickerActive)); } }

        public BuildViewModel()
        {
            _repository = new Repository();
            Points = new();
            Points.Add(Point.Zero);
            Angles = GetListAngels(_repository.DefaultAngles);
            _selectedAngleDefault = new Angle(0.00);
            _selectedAngle = _selectedAngleDefault;
            Segments = new();
            HasPickerActive = false;
            AddSegment = new Command(AddSegmentPoint);
            OnClear = new Command(ClearPoints);
        }

        private void ClearPoints(object sender)
        {
            Points.Clear();
            Segments.Clear();
            _selectedAngle = _selectedAngleDefault;
            Points.Add(Point.Zero);
            HasPickerActive = false;
        }

        private static List<string> GetListAngels(List<Angle> defaultAngles)
        {
            var list = new List<string>();
            foreach (var item in defaultAngles)
            {
                list.Add(item.Degrees.ToString());
            }
            return list;
        }

        private void AddSegmentPoint(object sender)
        {
            //if(_selectedAngle is null)
            //    return;
            var angle = _selectedAngle;
            Debug.Print(_selectedAngle.Degrees.ToString());
            if (Segments.Count > 0)
            {
                angle.SetValueDegrees(Segments[^1].Angle);
                Debug.Print(Segments[^1].Angle.Degrees.ToString());
            }
            var point = CreatePoint(EntrySegment, angle);
            Points.Add(point);
            var segment = new Segment(Points, EntrySegment, angle);
            Segments.Add(segment);
            HasPickerActive = true;
        }

        internal Point CreatePoint(double distance, Angle angle)
        {
            var newX = distance * Math.Cos(angle.Radian) + Points[^1].X;
            var newY = distance * Math.Sin(angle.Radian) + Points[^1].Y;
            return new Point(newX, newY);
        }

        private void OnPropertyChanged([CallerMemberName] string propertyName = "")
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }
    }
}
